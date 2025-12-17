package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Reviews: ImageVector
    get() {
        if (_Reviews != null) return _Reviews!!
        
        _Reviews = ImageVector.Builder(
            name = "reviews",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 499f)
                lineToRelative(76f, 46f)
                quadToRelative(11f, 7f, 22f, -0.5f)
                reflectiveQuadToRelative(8f, -20.5f)
                lineToRelative(-20f, -87f)
                lineToRelative(68f, -59f)
                quadToRelative(10f, -9f, 6f, -21.5f)
                reflectiveQuadTo(622f, 343f)
                lineToRelative(-89f, -7f)
                lineToRelative(-35f, -82f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-35f, 82f)
                lineToRelative(-89f, 7f)
                quadToRelative(-14f, 1f, -18f, 13.5f)
                reflectiveQuadToRelative(6f, 21.5f)
                lineToRelative(68f, 59f)
                lineToRelative(-20f, 87f)
                quadToRelative(-3f, 13f, 8f, 20.5f)
                reflectiveQuadToRelative(22f, 0.5f)
                lineToRelative(76f, -46f)
                close()
                moveTo(240f, 720f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-623f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-34f, -80f)
                horizontalLineToRelative(594f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(525f)
                lineToRelative(46f, -45f)
                close()
                moveToRelative(-46f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Reviews!!
    }

private var _Reviews: ImageVector? = null

