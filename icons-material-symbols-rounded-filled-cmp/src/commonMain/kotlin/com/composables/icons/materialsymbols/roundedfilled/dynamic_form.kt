package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Dynamic_form: ImageVector
    get() {
        if (_Dynamic_form != null) return _Dynamic_form!!
        
        _Dynamic_form = ImageVector.Builder(
            name = "dynamic_form",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 440f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 520f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(520f, -360f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 400f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineToRelative(181f)
                quadToRelative(21f, 0f, 33f, 17.5f)
                reflectiveQuadToRelative(4f, 37.5f)
                lineToRelative(-58f, 145f)
                horizontalLineToRelative(18f)
                quadToRelative(22f, 0f, 33.5f, 18.5f)
                reflectiveQuadTo(854f, 417f)
                lineTo(718f, 787f)
                quadToRelative(-3f, 8f, -9.5f, 10.5f)
                reflectiveQuadToRelative(-12.5f, 0.5f)
                quadToRelative(-6f, -2f, -11f, -6.5f)
                reflectiveQuadToRelative(-5f, -12.5f)
                verticalLineToRelative(-339f)
                close()
                moveTo(250f, 300f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(220f, 270f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(190f, 300f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(220f, 330f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(250f, 300f)
                close()
                moveToRelative(-30f, 390f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(250f, 660f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(220f, 630f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(190f, 660f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(220f, 690f)
                close()
            }
        }.build()
        
        return _Dynamic_form!!
    }

private var _Dynamic_form: ImageVector? = null

