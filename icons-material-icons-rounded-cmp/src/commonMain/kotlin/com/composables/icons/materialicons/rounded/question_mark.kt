package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Question_mark: ImageVector
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
                    moveTo(7.92f, 7.54f)
                    curveTo(7.12f, 7.2f, 6.78f, 6.21f, 7.26f, 5.49f)
                    curveTo(8.23f, 4.05f, 9.85f, 3f, 11.99f, 3f)
                    curveToRelative(2.35f, 0f, 3.96f, 1.07f, 4.78f, 2.41f)
                    curveToRelative(0.7f, 1.15f, 1.11f, 3.3f, 0.03f, 4.9f)
                    curveToRelative(-1.2f, 1.77f, -2.35f, 2.31f, -2.97f, 3.45f)
                    curveToRelative(-0.15f, 0.27f, -0.24f, 0.49f, -0.3f, 0.94f)
                    curveToRelative(-0.09f, 0.73f, -0.69f, 1.3f, -1.43f, 1.3f)
                    curveToRelative(-0.87f, 0f, -1.58f, -0.75f, -1.48f, -1.62f)
                    curveToRelative(0.06f, -0.51f, 0.18f, -1.04f, 0.46f, -1.54f)
                    curveToRelative(0.77f, -1.39f, 2.25f, -2.21f, 3.11f, -3.44f)
                    curveToRelative(0.91f, -1.29f, 0.4f, -3.7f, -2.18f, -3.7f)
                    curveToRelative(-1.17f, 0f, -1.93f, 0.61f, -2.4f, 1.34f)
                    curveTo(9.26f, 7.61f, 8.53f, 7.79f, 7.92f, 7.54f)
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

