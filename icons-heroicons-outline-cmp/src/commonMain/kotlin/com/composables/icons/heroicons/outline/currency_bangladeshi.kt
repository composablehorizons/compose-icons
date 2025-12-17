package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CurrencyBangladeshi: ImageVector
    get() {
        if (_CurrencyBangladeshi != null) return _CurrencyBangladeshi!!
        
        _CurrencyBangladeshi = ImageVector.Builder(
            name = "currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(8.25f, 7.5f)
                lineToRelative(0.415f, -0.207f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.085f, 0.67f)
                verticalLineTo(10.5f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, 0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(1.5f, 0f)
                verticalLineToRelative(5.438f)
                curveToRelative(0f, 0.354f, 0.161f, 0.697f, 0.473f, 0.865f)
                arcToRelative(3.751f, 3.751f, 0f, false, false, 5.452f, -2.553f)
                curveToRelative(0.083f, -0.409f, -0.263f, -0.75f, -0.68f, -0.75f)
                horizontalLineToRelative(-0.745f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
            }
        }.build()
        
        return _CurrencyBangladeshi!!
    }

private var _CurrencyBangladeshi: ImageVector? = null

