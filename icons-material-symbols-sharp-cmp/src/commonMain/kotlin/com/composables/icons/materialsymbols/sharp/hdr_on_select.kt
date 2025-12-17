package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hdr_on_select: ImageVector
    get() {
        if (_Hdr_on_select != null) return _Hdr_on_select!!
        
        _Hdr_on_select = ImageVector.Builder(
            name = "hdr_on_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(0f, -240f)
                close()
                moveTo(820f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-300f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(156f)
                horizontalLineToRelative(-36f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-36f, -80f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, -140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveTo(0f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineTo(60f)
                verticalLineToRelative(100f)
                horizontalLineTo(0f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(170f)
                lineToRelative(30f, 30f)
                verticalLineToRelative(180f)
                lineToRelative(-30f, 30f)
                horizontalLineTo(260f)
                close()
                moveToRelative(60f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Hdr_on_select!!
    }

private var _Hdr_on_select: ImageVector? = null

