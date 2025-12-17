package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Merge: ImageVector
    get() {
        if (_Merge != null) return _Merge!!
        
        _Merge = ImageVector.Builder(
            name = "merge",
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
                    moveTo(6.41f, 21f)
                    lineTo(5f, 19.59f)
                    lineToRelative(4.83f, -4.83f)
                    curveToRelative(0.75f, -0.75f, 1.17f, -1.77f, 1.17f, -2.83f)
                    verticalLineToRelative(-5.1f)
                    lineTo(9.41f, 8.41f)
                    lineTo(8f, 7f)
                    lineToRelative(4f, -4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(13f, 6.83f)
                    verticalLineToRelative(5.1f)
                    curveToRelative(0f, 1.06f, 0.42f, 2.08f, 1.17f, 2.83f)
                    lineTo(19f, 19.59f)
                    lineTo(17.59f, 21f)
                    lineTo(12f, 15.41f)
                    lineTo(6.41f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Merge!!
    }

private var _Merge: ImageVector? = null

