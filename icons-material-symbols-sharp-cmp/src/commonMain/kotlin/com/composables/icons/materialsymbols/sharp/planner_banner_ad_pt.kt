package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Planner_banner_ad_pt: ImageVector
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
                moveToRelative(40f, -80f)
                horizontalLineToRelative(400f)
                lineTo(542f, 540f)
                lineToRelative(-92f, 120f)
                lineToRelative(-62f, -80f)
                lineToRelative(-108f, 140f)
                close()
                moveToRelative(-40f, 80f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Planner_banner_ad_pt!!
    }

private var _Planner_banner_ad_pt: ImageVector? = null

