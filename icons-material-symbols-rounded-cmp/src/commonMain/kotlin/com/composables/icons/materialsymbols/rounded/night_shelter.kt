package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Night_shelter: ImageVector
    get() {
        if (_Night_shelter != null) return _Night_shelter!!
        
        _Night_shelter = ImageVector.Builder(
            name = "night_shelter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -19f, 8.5f, -36f)
                reflectiveQuadToRelative(23.5f, -28f)
                lineToRelative(240f, -180f)
                quadToRelative(21f, -16f, 48f, -16f)
                reflectiveQuadToRelative(48f, 16f)
                lineToRelative(240f, 180f)
                quadToRelative(15f, 11f, 23.5f, 28f)
                reflectiveQuadToRelative(8.5f, 36f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
                moveTo(320f, 660f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 480f)
                horizontalLineTo(500f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(460f, 520f)
                verticalLineToRelative(100f)
                horizontalLineTo(320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(70f, -60f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(440f, 550f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(390f, 500f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(340f, 550f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(390f, 600f)
                close()
            }
        }.build()
        
        return _Night_shelter!!
    }

private var _Night_shelter: ImageVector? = null

