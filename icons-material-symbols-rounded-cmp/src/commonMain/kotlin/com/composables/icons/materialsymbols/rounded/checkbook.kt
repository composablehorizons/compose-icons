package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Checkbook: ImageVector
    get() {
        if (_Checkbook != null) return _Checkbook!!
        
        _Checkbook = ImageVector.Builder(
            name = "checkbook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 600f)
                horizontalLineToRelative(223f)
                quadToRelative(20f, 0f, 30f, -12.5f)
                reflectiveQuadToRelative(10f, -27.5f)
                quadToRelative(0f, -15f, -10f, -27.5f)
                reflectiveQuadTo(503f, 520f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                close()
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 380f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 340f)
                verticalLineToRelative(-60f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 760f)
                horizontalLineTo(160f)
                close()
                moveToRelative(756f, -268f)
                quadToRelative(5f, 5f, 5f, 11f)
                reflectiveQuadToRelative(-5f, 11f)
                lineToRelative(-36f, 36f)
                lineToRelative(-70f, -70f)
                lineToRelative(36f, -36f)
                quadToRelative(5f, -5f, 11f, -5f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(48f, 48f)
                close()
                moveToRelative(-60f, 82f)
                lineTo(602f, 828f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-33f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-33f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(254f, -254f)
                lineToRelative(70f, 70f)
                close()
                moveTo(160f, 280f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Checkbook!!
    }

private var _Checkbook: ImageVector? = null

