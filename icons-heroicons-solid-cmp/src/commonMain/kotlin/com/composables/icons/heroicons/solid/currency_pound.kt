package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CurrencyPound: ImageVector
    get() {
        if (_CurrencyPound != null) return _CurrencyPound!!
        
        _CurrencyPound = ImageVector.Builder(
            name = "currency-pound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(9.763f, 9.51f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 3.828f, -1.351f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, -6.38f, 2.252f)
                curveToRelative(-0.033f, 0.307f, 0f, 0.595f, 0.032f, 0.822f)
                lineToRelative(0.154f, 1.077f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.421f)
                lineToRelative(0.138f, 0.964f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, -0.358f, 2.208f)
                lineToRelative(-0.122f, 0.242f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.908f, 1.047f)
                lineToRelative(1.539f, -0.512f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.948f, 0f)
                lineToRelative(0.655f, 0.218f)
                arcToRelative(3f, 3f, 0f, false, false, 2.29f, -0.163f)
                lineToRelative(0.666f, -0.333f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.67f, -1.342f)
                lineToRelative(-0.667f, 0.333f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.145f, 0.082f)
                lineToRelative(-0.654f, -0.218f)
                arcToRelative(3f, 3f, 0f, false, false, -1.898f, 0f)
                lineToRelative(-0.06f, 0.02f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, 0.053f, -1.794f)
                lineToRelative(-0.108f, -0.752f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9.972f)
                lineToRelative(-0.184f, -1.29f)
                arcToRelative(1.863f, 1.863f, 0f, false, true, -0.025f, -0.45f)
                close()
            }
        }.build()
        
        return _CurrencyPound!!
    }

private var _CurrencyPound: ImageVector? = null

