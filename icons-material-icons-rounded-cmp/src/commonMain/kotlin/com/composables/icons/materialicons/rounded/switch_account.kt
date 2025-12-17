package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Switch_account: ImageVector
    get() {
        if (_Switch_account != null) return _Switch_account!!
        
        _Switch_account = ImageVector.Builder(
            name = "switch_account",
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
                    moveTo(17f, 20f)
                    horizontalLineTo(4f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveTo(2f, 6.45f, 2f, 7f)
                    verticalLineToRelative(13f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(13f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(17.55f, 20f, 17f, 20f)
                    close()
                    moveTo(20f, 2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(14f, 5f)
                    curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                    curveTo(11f, 6.34f, 12.34f, 5f, 14f, 5f)
                    close()
                    moveTo(7.76f, 16f)
                    curveToRelative(1.47f, -1.83f, 3.71f, -3f, 6.24f, -3f)
                    reflectiveCurveToRelative(4.77f, 1.17f, 6.24f, 3f)
                    horizontalLineTo(7.76f)
                    close()
                }
            }
        }.build()
        
        return _Switch_account!!
    }

private var _Switch_account: ImageVector? = null

