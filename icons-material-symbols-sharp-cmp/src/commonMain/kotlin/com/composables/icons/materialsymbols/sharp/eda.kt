package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Eda: ImageVector
    get() {
        if (_Eda != null) return _Eda!!
        
        _Eda = ImageVector.Builder(
            name = "eda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 480f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 163f)
                verticalLineToRelative(-523f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(476f)
                lineToRelative(-80f, 47f)
                close()
                moveTo(200f, 840f)
                horizontalLineToRelative(363f)
                lineToRelative(194f, -194f)
                lineToRelative(-287f, 167f)
                lineToRelative(-130f, -173f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(260f)
                lineToRelative(110f, 147f)
                lineToRelative(190f, -111f)
                lineToRelative(136f, -78f)
                lineToRelative(105f, 78f)
                lineTo(597f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
                moveToRelative(0f, 360f)
                horizontalLineToRelative(363f)
                horizontalLineToRelative(-363f)
                close()
            }
        }.build()
        
        return _Eda!!
    }

private var _Eda: ImageVector? = null

