package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_luggage: ImageVector
    get() {
        if (_No_luggage != null) return _No_luggage!!
        
        _No_luggage = ImageVector.Builder(
            name = "no_luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.75f, 9f)
                verticalLineToRelative(0.92f)
                lineToRelative(1.75f, 1.75f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineToRelative(4.17f)
                lineToRelative(3f, 3f)
                verticalLineTo(6f)
                horizontalLineToRelative(-4f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(4f)
                horizontalLineTo(8.83f)
                lineToRelative(3f, 3f)
                horizontalLineTo(12.75f)
                close()
                moveTo(10.5f, 3.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3.5f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5f, 7.83f)
                verticalLineTo(21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.17f)
                lineToRelative(1.61f, 1.61f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(8f, 18f)
                verticalLineToRelative(-7.17f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                close()
                moveTo(11.25f, 18f)
                verticalLineToRelative(-3.92f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18f)
                horizontalLineTo(11.25f)
                close()
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null

