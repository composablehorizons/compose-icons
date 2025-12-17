package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Time_auto: ImageVector
    get() {
        if (_Time_auto != null) return _Time_auto!!
        
        _Time_auto = ImageVector.Builder(
            name = "time_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                horizontalLineToRelative(74f)
                lineToRelative(23f, -70f)
                horizontalLineToRelative(124f)
                lineToRelative(23f, 70f)
                horizontalLineToRelative(76f)
                lineTo(520f, 342f)
                horizontalLineToRelative(-80f)
                lineTo(320f, 680f)
                close()
                moveToRelative(116f, -128f)
                lineToRelative(44f, -132f)
                lineToRelative(43f, 132f)
                horizontalLineToRelative(-87f)
                close()
                moveToRelative(-76f, -432f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 774f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(62f, 0f, 119f, 20f)
                reflectiveQuadToRelative(107f, 58f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                quadToRelative(38f, 50f, 58f, 107f)
                reflectiveQuadToRelative(20f, 119f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadTo(734f, 774f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Time_auto!!
    }

private var _Time_auto: ImageVector? = null

