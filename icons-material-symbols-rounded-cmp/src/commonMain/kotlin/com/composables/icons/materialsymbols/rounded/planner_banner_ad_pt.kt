package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Planner_banner_ad_pt: ImageVector
    get() {
        if (_Planner_banner_ad_pt != null) return _Planner_banner_ad_pt!!
        
        _Planner_banner_ad_pt = ImageVector.Builder(
            name = "planner_banner_ad_pt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(210f, -140f)
                lineToRelative(-46f, -60f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-67f, 88f)
                quadToRelative(-8f, 10f, -2.5f, 21f)
                reflectiveQuadToRelative(18.5f, 11f)
                horizontalLineToRelative(318f)
                quadToRelative(13f, 0f, 18.5f, -11f)
                reflectiveQuadToRelative(-2.5f, -21f)
                lineToRelative(-97f, -127f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-76f, 99f)
                close()
                moveTo(240f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Planner_banner_ad_pt!!
    }

private var _Planner_banner_ad_pt: ImageVector? = null

