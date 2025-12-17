package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Android_cell_dual_5_bar_alert: ImageVector
    get() {
        if (_Android_cell_dual_5_bar_alert != null) return _Android_cell_dual_5_bar_alert!!
        
        _Android_cell_dual_5_bar_alert = ImageVector.Builder(
            name = "android_cell_dual_5_bar_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 560f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(180f)
                horizontalLineTo(40f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(230f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(280f)
                horizontalLineTo(420f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(40f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(230f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(420f)
                close()
                moveToRelative(380f, -313f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(314f)
                quadToRelative(-10f, -2f, -19.5f, -3f)
                reflectiveQuadToRelative(-20.5f, -1f)
                quadToRelative(-21f, 0f, -41.5f, 4.5f)
                reflectiveQuadTo(800f, 487f)
                close()
                moveToRelative(-190f, 73f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(298f)
                quadToRelative(-5f, 5f, -9f, 10.5f)
                reflectiveQuadToRelative(-8f, 11.5f)
                horizontalLineTo(610f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(72f)
                quadToRelative(-7f, 43f, 5f, 85f)
                reflectiveQuadToRelative(41f, 75f)
                horizontalLineTo(610f)
                close()
                moveToRelative(270f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 800f)
                close()
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Android_cell_dual_5_bar_alert!!
    }

private var _Android_cell_dual_5_bar_alert: ImageVector? = null

