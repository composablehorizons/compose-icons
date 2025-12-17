package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Privacy: ImageVector
    get() {
        if (_Privacy != null) return _Privacy!!
        
        _Privacy = ImageVector.Builder(
            name = "privacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(394f, 281f)
                quadToRelative(2f, 0f, 3f, -0.5f)
                reflectiveQuadToRelative(3f, -0.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 360f)
                verticalLineToRelative(7f)
                lineToRelative(-86f, -86f)
                close()
                moveToRelative(486f, 419f)
                lineTo(720f, 540f)
                verticalLineToRelative(67f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-287f)
                horizontalLineTo(353f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(367f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                close()
                moveTo(640f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(212f)
                verticalLineToRelative(-42f)
                quadToRelative(-75f, -11f, -123.5f, -67f)
                reflectiveQuadTo(200f, 480f)
                horizontalLineToRelative(57f)
                quadToRelative(0f, 60f, 41.5f, 101.5f)
                reflectiveQuadTo(400f, 623f)
                quadToRelative(33f, 0f, 62.5f, -14.5f)
                reflectiveQuadTo(512f, 568f)
                lineToRelative(41f, 41f)
                quadToRelative(-24f, 29f, -56f, 46.5f)
                reflectiveQuadTo(428f, 678f)
                verticalLineToRelative(42f)
                horizontalLineToRelative(212f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveToRelative(238f, 78f)
                lineToRelative(-56f, 56f)
                lineToRelative(-385f, -385f)
                quadToRelative(-9f, 5f, -18f, 8f)
                reflectiveQuadToRelative(-19f, 3f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 480f)
                verticalLineToRelative(-48f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                close()
                moveTo(384f, 496f)
                close()
                moveToRelative(113f, -113f)
                close()
                moveTo(372f, 720f)
                horizontalLineToRelative(56f)
                horizontalLineToRelative(-56f)
                close()
            }
        }.build()
        
        return _Privacy!!
    }

private var _Privacy: ImageVector? = null

