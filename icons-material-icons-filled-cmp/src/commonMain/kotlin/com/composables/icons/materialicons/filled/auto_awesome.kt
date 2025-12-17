package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Auto_awesome: ImageVector
    get() {
        if (_Auto_awesome != null) return _Auto_awesome!!
        
        _Auto_awesome = ImageVector.Builder(
            name = "auto_awesome",
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
                moveTo(19f, 9f)
                lineToRelative(1.25f, -2.75f)
                lineTo(23f, 5f)
                lineToRelative(-2.75f, -1.25f)
                lineTo(19f, 1f)
                lineToRelative(-1.25f, 2.75f)
                lineTo(15f, 5f)
                lineToRelative(2.75f, 1.25f)
                lineTo(19f, 9f)
                close()
                moveToRelative(-7.5f, 0.5f)
                lineTo(9f, 4f)
                lineTo(6.5f, 9.5f)
                lineTo(1f, 12f)
                lineToRelative(5.5f, 2.5f)
                lineTo(9f, 20f)
                lineToRelative(2.5f, -5.5f)
                lineTo(17f, 12f)
                lineToRelative(-5.5f, -2.5f)
                close()
                moveTo(19f, 15f)
                lineToRelative(-1.25f, 2.75f)
                lineTo(15f, 19f)
                lineToRelative(2.75f, 1.25f)
                lineTo(19f, 23f)
                lineToRelative(1.25f, -2.75f)
                lineTo(23f, 19f)
                lineToRelative(-2.75f, -1.25f)
                lineTo(19f, 15f)
                close()
            }
        }.build()
        
        return _Auto_awesome!!
    }

private var _Auto_awesome: ImageVector? = null

