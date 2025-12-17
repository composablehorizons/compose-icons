package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cloud_sync: ImageVector
    get() {
        if (_Cloud_sync != null) return _Cloud_sync!!
        
        _Cloud_sync = ImageVector.Builder(
            name = "cloud_sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(109f)
                quadToRelative(-51f, -44f, -80f, -106f)
                reflectiveQuadToRelative(-29f, -134f)
                quadToRelative(0f, -112f, 68f, -197.5f)
                reflectiveQuadTo(400f, 170f)
                verticalLineToRelative(84f)
                quadToRelative(-70f, 25f, -115f, 86.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 54f, 21.5f, 99.5f)
                reflectiveQuadTo(320f, 658f)
                verticalLineToRelative(-98f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -48f, 33f, -82.5f)
                reflectiveQuadToRelative(81f, -36.5f)
                quadToRelative(17f, -36f, 50.5f, -58.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(53f, 0f, 91.5f, 34.5f)
                reflectiveQuadTo(858f, 600f)
                quadToRelative(42f, 0f, 72f, 29f)
                reflectiveQuadToRelative(30f, 70f)
                quadToRelative(0f, 42f, -29f, 71.5f)
                reflectiveQuadTo(860f, 800f)
                horizontalLineTo(600f)
                close()
                moveToRelative(116f, -360f)
                quadToRelative(-7f, -41f, -27f, -76f)
                reflectiveQuadToRelative(-49f, -62f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(691f)
                quadToRelative(43f, 38f, 70.5f, 89f)
                reflectiveQuadTo(797f, 440f)
                horizontalLineToRelative(-81f)
                close()
            }
        }.build()
        
        return _Cloud_sync!!
    }

private var _Cloud_sync: ImageVector? = null

