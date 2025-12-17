package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Atm: ImageVector
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
                moveTo(3.5f, 13.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                close()
                moveToRelative(13.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(14f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.51f)
                horizontalLineToRelative(1f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineTo(17f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(10.25f, 15f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.25f)
                close()
            }
        }.build()
        
        return _Atm!!
    }

private var _Atm: ImageVector? = null

