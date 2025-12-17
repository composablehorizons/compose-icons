package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Arrow_circle_right: ImageVector
    get() {
        if (_Arrow_circle_right != null) return _Arrow_circle_right!!
        
        _Arrow_circle_right = ImageVector.Builder(
            name = "arrow_circle_right",
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
                    moveTo(22f, 12f)
                    curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                    reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveTo(22f, 17.52f, 22f, 12f)
                    close()
                    moveTo(12f, 13f)
                    lineToRelative(-4f, 0f)
                    verticalLineToRelative(-2f)
                    lineToRelative(4f, 0f)
                    verticalLineTo(8f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_circle_right!!
    }

private var _Arrow_circle_right: ImageVector? = null

