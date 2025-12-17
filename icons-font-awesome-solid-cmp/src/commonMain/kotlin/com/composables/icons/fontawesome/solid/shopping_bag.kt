package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) return _ShoppingBag!!
        
        _ShoppingBag = ImageVector.Builder(
            name = "shopping-bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 160f)
                verticalLineToRelative(-32f)
                curveTo(352f, 57.42f, 294.579f, 0f, 224f, 0f)
                curveTo(153.42f, 0f, 96f, 57.42f, 96f, 128f)
                verticalLineToRelative(32f)
                horizontalLineTo(0f)
                verticalLineToRelative(272f)
                curveToRelative(0f, 44.183f, 35.817f, 80f, 80f, 80f)
                horizontalLineToRelative(288f)
                curveToRelative(44.183f, 0f, 80f, -35.817f, 80f, -80f)
                verticalLineTo(160f)
                horizontalLineToRelative(-96f)
                close()
                moveToRelative(-192f, -32f)
                curveToRelative(0f, -35.29f, 28.71f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.71f, 64f, 64f)
                verticalLineToRelative(32f)
                horizontalLineTo(160f)
                verticalLineToRelative(-32f)
                close()
                moveToRelative(160f, 120f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                close()
                moveToRelative(-192f, 0f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _ShoppingBag!!
    }

private var _ShoppingBag: ImageVector? = null

