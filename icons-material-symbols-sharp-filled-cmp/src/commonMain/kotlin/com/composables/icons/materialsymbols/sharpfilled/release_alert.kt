package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Release_alert: ImageVector
    get() {
        if (_Release_alert != null) return _Release_alert!!
        
        _Release_alert = ImageVector.Builder(
            name = "release_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 900f)
                lineToRelative(-76f, -128f)
                lineToRelative(-144f, -32f)
                lineToRelative(14f, -148f)
                lineToRelative(-98f, -112f)
                lineToRelative(98f, -112f)
                lineToRelative(-14f, -148f)
                lineToRelative(144f, -32f)
                lineToRelative(76f, -128f)
                lineToRelative(136f, 58f)
                lineToRelative(136f, -58f)
                lineToRelative(76f, 128f)
                lineToRelative(144f, 32f)
                lineToRelative(-14f, 148f)
                lineToRelative(98f, 112f)
                lineToRelative(-98f, 112f)
                lineToRelative(14f, 148f)
                lineToRelative(-144f, 32f)
                lineToRelative(-76f, 128f)
                lineToRelative(-136f, -58f)
                lineToRelative(-136f, 58f)
                close()
                moveToRelative(136f, -220f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-40f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Release_alert!!
    }

private var _Release_alert: ImageVector? = null

