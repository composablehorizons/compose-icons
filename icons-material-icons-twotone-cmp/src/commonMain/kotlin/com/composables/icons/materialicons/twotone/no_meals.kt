package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.No_meals: ImageVector
    get() {
        if (_No_meals != null) return _No_meals!!
        
        _No_meals = ImageVector.Builder(
            name = "no_meals",
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
                moveTo(16f, 14f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.76f, 2.24f, -4f, 5f, -4f)
                verticalLineToRelative(16.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(10.02f, 12.85f)
                curveTo(9.69f, 12.94f, 9.36f, 13f, 9f, 13f)
                verticalLineToRelative(9f)
                horizontalLineTo(7f)
                verticalLineToRelative(-9f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineTo(5.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(6.17f, 9f)
                lineTo(5f, 7.83f)
                verticalLineTo(9f)
                horizontalLineTo(6.17f)
                close()
                moveTo(9f, 2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(2f)
                close()
                moveTo(13f, 9f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.17f)
                lineToRelative(1.85f, 1.85f)
                curveTo(12.94f, 9.69f, 13f, 9.36f, 13f, 9f)
                close()
            }
        }.build()
        
        return _No_meals!!
    }

private var _No_meals: ImageVector? = null

