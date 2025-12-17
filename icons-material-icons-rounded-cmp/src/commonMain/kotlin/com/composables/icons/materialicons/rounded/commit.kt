package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Commit: ImageVector
    get() {
        if (_Commit != null) return _Commit!!
        
        _Commit = ImageVector.Builder(
            name = "commit",
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
                    moveTo(21f, 13f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4.1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.46f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                    reflectiveCurveToRelative(-4.44f, 1.72f, -4.9f, 4f)
                    horizontalLineToRelative(0f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4.1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.46f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                    reflectiveCurveToRelative(4.44f, -1.72f, 4.9f, -4f)
                    horizontalLineToRelative(0f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(12f, 15f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                    reflectiveCurveTo(13.66f, 15f, 12f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Commit!!
    }

private var _Commit: ImageVector? = null

