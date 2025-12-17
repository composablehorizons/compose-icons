package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Share_reviews: ImageVector
    get() {
        if (_Share_reviews != null) return _Share_reviews!!
        
        _Share_reviews = ImageVector.Builder(
            name = "share_reviews",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 600f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(-15f, 0f, -28.5f, 5.5f)
                reflectiveQuadTo(527f, 460f)
                lineToRelative(-107f, -54f)
                verticalLineToRelative(-12f)
                lineToRelative(107f, -54f)
                quadToRelative(11f, 9f, 24.5f, 14.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(660f, 280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(580f, 200f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(500f, 280f)
                verticalLineToRelative(6f)
                lineToRelative(-107f, 54f)
                quadToRelative(-11f, -9f, -24.5f, -14.5f)
                reflectiveQuadTo(340f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(260f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(15f, 0f, 28.5f, -5.5f)
                reflectiveQuadTo(393f, 460f)
                lineToRelative(107f, 54f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(580f, 600f)
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
        
        return _Share_reviews!!
    }

private var _Share_reviews: ImageVector? = null

