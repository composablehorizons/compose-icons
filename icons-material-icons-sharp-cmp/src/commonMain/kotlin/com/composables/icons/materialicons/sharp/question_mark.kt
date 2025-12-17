package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Question_mark: ImageVector
    get() {
        if (_Question_mark != null) return _Question_mark!!
        
        _Question_mark = ImageVector.Builder(
            name = "question_mark",
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
                    moveTo(11.07f, 12.85f)
                    curveToRelative(0.77f, -1.39f, 2.25f, -2.21f, 3.11f, -3.44f)
                    curveToRelative(0.91f, -1.29f, 0.4f, -3.7f, -2.18f, -3.7f)
                    curveToRelative(-1.69f, 0f, -2.52f, 1.28f, -2.87f, 2.34f)
                    lineTo(6.54f, 6.96f)
                    curveTo(7.25f, 4.83f, 9.18f, 3f, 11.99f, 3f)
                    curveToRelative(2.35f, 0f, 3.96f, 1.07f, 4.78f, 2.41f)
                    curveToRelative(0.7f, 1.15f, 1.11f, 3.3f, 0.03f, 4.9f)
                    curveToRelative(-1.2f, 1.77f, -2.35f, 2.31f, -2.97f, 3.45f)
                    curveToRelative(-0.25f, 0.46f, -0.35f, 0.76f, -0.35f, 2.24f)
                    horizontalLineToRelative(-2.89f)
                    curveTo(10.58f, 15.22f, 10.46f, 13.95f, 11.07f, 12.85f)
                    close()
                    moveTo(14f, 20f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(14f, 18.9f, 14f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Question_mark!!
    }

private var _Question_mark: ImageVector? = null

