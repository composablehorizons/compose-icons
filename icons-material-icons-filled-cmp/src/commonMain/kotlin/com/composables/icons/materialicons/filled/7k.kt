package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`7k`: ImageVector
    get() {
        if (_7k != null) return _7k!!
        
        _7k = ImageVector.Builder(
            name = "7k",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(9.5f, 15f)
                horizontalLineTo(7.75f)
                lineToRelative(1.38f, -4.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                curveToRelative(0.67f, 0f, 1.15f, 0.65f, 0.96f, 1.29f)
                lineTo(9.5f, 15f)
                close()
                moveToRelative(8.5f, 0f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-1.75f, -2.25f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                lineTo(16.25f, 9f)
                horizontalLineTo(18f)
                lineToRelative(-2.25f, 3f)
                lineTo(18f, 15f)
                close()
            }
        }.build()
        
        return _7k!!
    }

private var _7k: ImageVector? = null

