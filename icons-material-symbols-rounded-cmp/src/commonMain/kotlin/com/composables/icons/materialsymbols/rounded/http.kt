package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Http: ImageVector
    get() {
        if (_Http != null) return _Http!!
        
        _Http = ImageVector.Builder(
            name = "http",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(70f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(100f, 390f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(210f, 360f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(240f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(210f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(180f, 570f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(70f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(40f, 570f)
                close()
                moveToRelative(300f, 0f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(-30f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(280f, 390f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(310f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(460f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(430f, 420f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(370f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(340f, 570f)
                close()
                moveToRelative(220f, 0f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(-30f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(500f, 390f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(530f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(680f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(650f, 420f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(590f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(560f, 570f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(750f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(750f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(720f, 570f)
                close()
                moveToRelative(60f, -110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Http!!
    }

private var _Http: ImageVector? = null

