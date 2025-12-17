package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Microwave: ImageVector
    get() {
        if (_Microwave != null) return _Microwave!!
        
        _Microwave = ImageVector.Builder(
            name = "microwave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(520f, -360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, 160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 680f)
                close()
                moveToRelative(-310f, -40f)
                quadToRelative(-24f, 0f, -41.5f, -9f)
                reflectiveQuadTo(338f, 614f)
                quadToRelative(-10f, -7f, -16f, -10.5f)
                reflectiveQuadToRelative(-12f, -3.5f)
                quadToRelative(-11f, 0f, -22f, 9f)
                reflectiveQuadToRelative(-16f, 15f)
                lineToRelative(-57f, -56f)
                quadToRelative(11f, -12f, 35.5f, -30f)
                reflectiveQuadToRelative(59.5f, -18f)
                quadToRelative(24f, 0f, 41.5f, 9.5f)
                reflectiveQuadTo(382f, 547f)
                quadToRelative(9f, 6f, 16f, 9.5f)
                reflectiveQuadToRelative(12f, 3.5f)
                quadToRelative(11f, 0f, 22f, -9f)
                reflectiveQuadToRelative(16f, -15f)
                lineToRelative(57f, 56f)
                quadToRelative(-11f, 12f, -35.5f, 30f)
                reflectiveQuadTo(410f, 640f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(-24f, 0f, -41.5f, -9f)
                reflectiveQuadTo(338f, 414f)
                quadToRelative(-10f, -7f, -16f, -10.5f)
                reflectiveQuadToRelative(-12f, -3.5f)
                quadToRelative(-11f, 0f, -22f, 9f)
                reflectiveQuadToRelative(-16f, 15f)
                lineToRelative(-57f, -56f)
                quadToRelative(11f, -12f, 35.5f, -30f)
                reflectiveQuadToRelative(59.5f, -18f)
                quadToRelative(24f, 0f, 41.5f, 9.5f)
                reflectiveQuadTo(382f, 347f)
                quadToRelative(9f, 6f, 16f, 9.5f)
                reflectiveQuadToRelative(12f, 3.5f)
                quadToRelative(11f, 0f, 22f, -9f)
                reflectiveQuadToRelative(16f, -15f)
                lineToRelative(57f, 56f)
                quadToRelative(-11f, 12f, -35.5f, 30f)
                reflectiveQuadTo(410f, 440f)
                close()
            }
        }.build()
        
        return _Microwave!!
    }

private var _Microwave: ImageVector? = null

