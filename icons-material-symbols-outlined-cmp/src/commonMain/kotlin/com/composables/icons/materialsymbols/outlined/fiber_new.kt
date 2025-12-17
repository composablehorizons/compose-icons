package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fiber_new: ImageVector
    get() {
        if (_Fiber_new != null) return _Fiber_new!!
        
        _Fiber_new = ImageVector.Builder(
            name = "fiber_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-480f)
                horizontalLineTo(120f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(20f, -120f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-140f)
                lineToRelative(102f, 140f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(140f)
                lineTo(190f, 360f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-50f)
                horizontalLineTo(440f)
                verticalLineToRelative(-44f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-50f)
                horizontalLineTo(440f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-50f)
                horizontalLineTo(380f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(820f, 560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(620f, 600f)
                close()
                moveTo(120f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Fiber_new!!
    }

private var _Fiber_new: ImageVector? = null

