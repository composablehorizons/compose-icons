package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sync_saved_locally: ImageVector
    get() {
        if (_Sync_saved_locally != null) return _Sync_saved_locally!!
        
        _Sync_saved_locally = ImageVector.Builder(
            name = "sync_saved_locally",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(437f, 449f)
                lineToRelative(-57f, -57f)
                quadToRelative(-11f, -11f, -27.5f, -11.5f)
                reflectiveQuadTo(324f, 392f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(85f, 86f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(186f, -170f)
                quadToRelative(0f, -16f, -2f, -31f)
                reflectiveQuadToRelative(-13f, -26f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(579f, 307f)
                lineTo(437f, 449f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(840f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Sync_saved_locally!!
    }

private var _Sync_saved_locally: ImageVector? = null

