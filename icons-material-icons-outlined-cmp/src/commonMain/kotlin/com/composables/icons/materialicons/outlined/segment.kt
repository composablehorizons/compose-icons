package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Segment: ImageVector
    get() {
        if (_Segment != null) return _Segment!!
        
        _Segment = ImageVector.Builder(
            name = "segment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 18f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9f)
                    verticalLineTo(18f)
                    close()
                    moveTo(3f, 6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(6f)
                    horizontalLineTo(3f)
                    close()
                    moveTo(9f, 13f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Segment!!
    }

private var _Segment: ImageVector? = null

