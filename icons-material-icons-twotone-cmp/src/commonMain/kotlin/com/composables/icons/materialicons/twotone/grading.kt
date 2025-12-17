package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Grading: ImageVector
    get() {
        if (_Grading != null) return _Grading!!
        
        _Grading = ImageVector.Builder(
            name = "grading",
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
                    moveTo(4f, 7f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineTo(7f)
                    close()
                    moveTo(4f, 13f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(13f)
                    close()
                    moveTo(4f, 17f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(17f)
                    close()
                    moveTo(4f, 21f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(21f)
                    close()
                    moveTo(15.41f, 18.17f)
                    lineTo(14f, 16.75f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(15.41f, 21f)
                    lineTo(20f, 16.42f)
                    lineTo(18.58f, 15f)
                    lineTo(15.41f, 18.17f)
                    close()
                    moveTo(4f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(3f)
                    horizontalLineTo(4f)
                    close()
                }
            }
        }.build()
        
        return _Grading!!
    }

private var _Grading: ImageVector? = null

