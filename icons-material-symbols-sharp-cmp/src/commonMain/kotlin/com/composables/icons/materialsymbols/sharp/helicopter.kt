package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Helicopter: ImageVector
    get() {
        if (_Helicopter != null) return _Helicopter!!
        
        _Helicopter = ImageVector.Builder(
            name = "helicopter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 520f)
                verticalLineToRelative(-240f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(160f, 160f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(400f)
                close()
                moveToRelative(80f, -128f)
                lineToRelative(240f, -24f)
                verticalLineToRelative(-48f)
                horizontalLineTo(600f)
                verticalLineToRelative(72f)
                close()
                moveTo(520f, 880f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(80f, -120f)
                horizontalLineTo(40f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                lineToRelative(40f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                lineToRelative(-320f, 32f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(160f, -600f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                close()
                moveTo(600f, 552f)
                verticalLineToRelative(-72f)
                verticalLineToRelative(72f)
                close()
                moveToRelative(-80f, 128f)
                close()
            }
        }.build()
        
        return _Helicopter!!
    }

private var _Helicopter: ImageVector? = null

