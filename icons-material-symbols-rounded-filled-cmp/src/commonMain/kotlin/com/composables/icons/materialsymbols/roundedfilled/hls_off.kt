package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hls_off: ImageVector
    get() {
        if (_Hls_off != null) return _Hls_off!!
        
        _Hls_off = ImageVector.Builder(
            name = "hls_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(820f, 400f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(820f, 500f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(780f, 600f)
                horizontalLineToRelative(-67f)
                lineToRelative(-60f, -60f)
                horizontalLineToRelative(107f)
                verticalLineToRelative(-40f)
                horizontalLineTo(660f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(620f, 460f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 360f)
                horizontalLineToRelative(120f)
                close()
                moveTo(120f, 570f)
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
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(150f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(120f, 570f)
                close()
                moveTo(763f, 876f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(678f, 679f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(400f, 570f)
                verticalLineToRelative(-113f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(23f)
                horizontalLineToRelative(24f)
                lineToRelative(60f, 60f)
                horizontalLineTo(430f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(400f, 570f)
                close()
            }
        }.build()
        
        return _Hls_off!!
    }

private var _Hls_off: ImageVector? = null

