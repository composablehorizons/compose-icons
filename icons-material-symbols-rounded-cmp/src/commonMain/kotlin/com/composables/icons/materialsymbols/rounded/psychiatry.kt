package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Psychiatry: ImageVector
    get() {
        if (_Psychiatry != null) return _Psychiatry!!
        
        _Psychiatry = ImageVector.Builder(
            name = "psychiatry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-279f)
                quadToRelative(-64f, 0f, -123f, -24.5f)
                reflectiveQuadTo(213f, 427f)
                quadToRelative(-45f, -45f, -69f, -104f)
                reflectiveQuadToRelative(-24f, -123f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(40f)
                quadToRelative(63f, 0f, 122f, 24.5f)
                reflectiveQuadTo(426f, 214f)
                quadToRelative(31f, 31f, 51.5f, 68f)
                reflectiveQuadToRelative(31.5f, 79f)
                quadToRelative(5f, -7f, 11f, -13.5f)
                reflectiveQuadToRelative(13f, -13.5f)
                quadToRelative(45f, -45f, 104f, -69.5f)
                reflectiveQuadTo(760f, 240f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 64f, -24.5f, 123f)
                reflectiveQuadTo(746f, 547f)
                quadToRelative(-45f, 45f, -103.5f, 69f)
                reflectiveQuadTo(520f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(-40f, -400f)
                quadToRelative(0f, -48f, -18.5f, -91.5f)
                reflectiveQuadTo(369f, 271f)
                quadToRelative(-34f, -34f, -77.5f, -52.5f)
                reflectiveQuadTo(200f, 200f)
                quadToRelative(0f, 48f, 18f, 92f)
                reflectiveQuadToRelative(52f, 78f)
                quadToRelative(34f, 34f, 78f, 52f)
                reflectiveQuadToRelative(92f, 18f)
                close()
                moveToRelative(80f, 120f)
                quadToRelative(48f, 0f, 91.5f, -18f)
                reflectiveQuadToRelative(77.5f, -52f)
                quadToRelative(34f, -34f, 52.5f, -78f)
                reflectiveQuadToRelative(18.5f, -92f)
                quadToRelative(-48f, 0f, -92f, 18.5f)
                reflectiveQuadTo(590f, 391f)
                quadToRelative(-34f, 34f, -52f, 77.5f)
                reflectiveQuadTo(520f, 560f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(-80f, -120f)
                close()
            }
        }.build()
        
        return _Psychiatry!!
    }

private var _Psychiatry: ImageVector? = null

