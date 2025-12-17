package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hdr_on: ImageVector
    get() {
        if (_Hdr_on != null) return _Hdr_on!!
        
        _Hdr_on = ImageVector.Builder(
            name = "hdr_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(670f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 23f, -10.5f, 35.5f)
                reflectiveQuadTo(804f, 516f)
                lineToRelative(20f, 46f)
                quadToRelative(6f, 14f, -2f, 26f)
                reflectiveQuadToRelative(-24f, 12f)
                quadToRelative(-8f, 0f, -15f, -4f)
                reflectiveQuadToRelative(-10f, -12f)
                lineToRelative(-29f, -64f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(670f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(640f, 570f)
                close()
                moveToRelative(60f, -110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-520f, 40f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(150f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(120f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(150f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(180f, 390f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(290f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(320f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(290f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(260f, 570f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(340f, 100f)
                horizontalLineTo(410f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(380f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(410f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                close()
                moveToRelative(-80f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Hdr_on!!
    }

private var _Hdr_on: ImageVector? = null

