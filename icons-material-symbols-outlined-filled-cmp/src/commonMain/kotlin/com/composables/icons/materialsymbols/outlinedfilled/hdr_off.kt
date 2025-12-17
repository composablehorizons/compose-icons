package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hdr_off: ImageVector
    get() {
        if (_Hdr_off != null) return _Hdr_off!!
        
        _Hdr_off = ImageVector.Builder(
            name = "hdr_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 734f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(-12f, -304f)
                lineToRelative(-36f, -80f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(66f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(140f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -10.5f, 32.5f)
                reflectiveQuadTo(804f, 516f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-80f, -140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-120f, 6f)
                lineTo(474f, 360f)
                horizontalLineToRelative(46f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(46f)
                close()
                moveTo(120f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(260f, -164f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(45f)
                lineToRelative(55f, 56f)
                quadToRelative(-5f, 2f, -10f, 3f)
                reflectiveQuadToRelative(-10f, 1f)
                horizontalLineTo(380f)
                verticalLineToRelative(-164f)
                close()
            }
        }.build()
        
        return _Hdr_off!!
    }

private var _Hdr_off: ImageVector? = null

