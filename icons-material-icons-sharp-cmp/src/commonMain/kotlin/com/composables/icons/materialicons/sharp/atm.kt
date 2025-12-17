package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Atm: ImageVector
    get() {
        if (_Atm != null) return _Atm!!
        
        _Atm = ImageVector.Builder(
            name = "atm",
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
                moveTo(8f, 9f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
                moveToRelative(-1.5f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(6f)
                horizontalLineTo(17f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(14f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.51f)
                horizontalLineToRelative(1f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Atm!!
    }

private var _Atm: ImageVector? = null

