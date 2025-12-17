package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ac_unit: ImageVector
    get() {
        if (_Ac_unit != null) return _Ac_unit!!
        
        _Ac_unit = ImageVector.Builder(
            name = "ac_unit",
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
                moveTo(22f, 11f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(3.24f, -3.24f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(15f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                lineToRelative(4.66f, -4.66f)
                lineToRelative(-1.42f, -1.41f)
                lineTo(13f, 6.17f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.17f)
                lineTo(7.76f, 2.93f)
                lineTo(6.34f, 4.34f)
                lineTo(11f, 9f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                lineTo(4.34f, 6.34f)
                lineTo(2.93f, 7.76f)
                lineTo(6.17f, 11f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-3.24f, 3.24f)
                lineToRelative(1.41f, 1.42f)
                lineTo(9f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineToRelative(-4.66f, 4.66f)
                lineToRelative(1.42f, 1.41f)
                lineTo(11f, 17.83f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.17f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(1.42f, -1.41f)
                lineTo(13f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineToRelative(4.66f, 4.66f)
                lineToRelative(1.41f, -1.42f)
                lineTo(17.83f, 13f)
                horizontalLineTo(22f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Ac_unit!!
    }

private var _Ac_unit: ImageVector? = null

