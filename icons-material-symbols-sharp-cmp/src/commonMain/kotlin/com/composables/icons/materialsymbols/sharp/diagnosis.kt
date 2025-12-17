package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Diagnosis: ImageVector
    get() {
        if (_Diagnosis != null) return _Diagnosis!!
        
        _Diagnosis = ImageVector.Builder(
            name = "diagnosis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, -148f)
                quadToRelative(66f, -60f, 113f, -106.5f)
                reflectiveQuadToRelative(47f, -97.5f)
                quadToRelative(0f, -36f, -26f, -62f)
                reflectiveQuadToRelative(-62f, -26f)
                quadToRelative(-21f, 0f, -40.5f, 8.5f)
                reflectiveQuadTo(480f, 232f)
                quadToRelative(-12f, -15f, -31.5f, -23.5f)
                reflectiveQuadTo(408f, 200f)
                quadToRelative(-36f, 0f, -62f, 26f)
                reflectiveQuadToRelative(-26f, 62f)
                quadToRelative(0f, 51f, 45.5f, 96f)
                reflectiveQuadTo(480f, 492f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Diagnosis!!
    }

private var _Diagnosis: ImageVector? = null

