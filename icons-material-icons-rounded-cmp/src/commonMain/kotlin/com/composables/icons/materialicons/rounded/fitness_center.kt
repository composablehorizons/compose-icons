package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fitness_center: ImageVector
    get() {
        if (_Fitness_center != null) return _Fitness_center!!
        
        _Fitness_center = ImageVector.Builder(
            name = "fitness_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.57f, 14.86f)
                lineToRelative(0.72f, -0.72f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.02f, -0.02f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(17f, 15.57f)
                lineTo(8.43f, 7f)
                lineToRelative(2.86f, -2.86f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.02f, -0.02f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0f)
                lineTo(5.57f, 4.14f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-0.39f, -0.39f, -1.04f, -0.39f, -1.43f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.04f, 0f, 1.43f)
                lineToRelative(0.72f, 0.72f)
                lineTo(2.71f, 7f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.72f, 0.72f)
                lineToRelative(-0.72f, 0.73f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(7f, 8.43f)
                lineTo(15.57f, 17f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.72f, -0.72f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.04f, 0f, -1.43f)
                lineToRelative(-0.72f, -0.72f)
                lineTo(21.29f, 17f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.72f, -0.73f)
                close()
            }
        }.build()
        
        return _Fitness_center!!
    }

private var _Fitness_center: ImageVector? = null

