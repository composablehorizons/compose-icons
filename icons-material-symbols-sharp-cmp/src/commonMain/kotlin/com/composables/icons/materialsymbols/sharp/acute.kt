package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Acute: ImageVector
    get() {
        if (_Acute != null) return _Acute!!
        
        _Acute = ImageVector.Builder(
            name = "acute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -133f, 93f, -226.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(133f, 0f, 226.5f, 93.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 134f, -93.5f, 227f)
                reflectiveQuadTo(600f, 800f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(91f, -91f)
                lineToRelative(57f, -57f)
                lineToRelative(-108f, -108f)
                verticalLineToRelative(-144f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(177f)
                lineToRelative(131f, 132f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(40f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(40f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(520f, -200f)
                close()
            }
        }.build()
        
        return _Acute!!
    }

private var _Acute: ImageVector? = null

