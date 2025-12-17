package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fitness_center: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.57f, 14.86f)
                lineTo(22f, 13.43f)
                lineTo(20.57f, 12f)
                lineTo(17f, 15.57f)
                lineTo(8.43f, 7f)
                lineTo(12f, 3.43f)
                lineTo(10.57f, 2f)
                lineTo(9.14f, 3.43f)
                lineTo(7.71f, 2f)
                lineTo(5.57f, 4.14f)
                lineTo(4.14f, 2.71f)
                lineTo(2.71f, 4.14f)
                lineToRelative(1.43f, 1.43f)
                lineTo(2f, 7.71f)
                lineToRelative(1.43f, 1.43f)
                lineTo(2f, 10.57f)
                lineTo(3.43f, 12f)
                lineTo(7f, 8.43f)
                lineTo(15.57f, 17f)
                lineTo(12f, 20.57f)
                lineTo(13.43f, 22f)
                lineToRelative(1.43f, -1.43f)
                lineTo(16.29f, 22f)
                lineToRelative(2.14f, -2.14f)
                lineToRelative(1.43f, 1.43f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(-1.43f, -1.43f)
                lineTo(22f, 16.29f)
                close()
            }
        }.build()
        
        return _Fitness_center!!
    }

private var _Fitness_center: ImageVector? = null

