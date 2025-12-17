package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Doorbell: ImageVector
    get() {
        if (_Doorbell != null) return _Doorbell!!
        
        _Doorbell = ImageVector.Builder(
            name = "doorbell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 700f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 660f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(-160f, -60f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-94f)
                quadToRelative(0f, -44f, -24f, -80f)
                reflectiveQuadToRelative(-66f, -46f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 370f)
                verticalLineToRelative(10f)
                quadToRelative(-42f, 10f, -66f, 46f)
                reflectiveQuadToRelative(-24f, 80f)
                verticalLineToRelative(94f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Doorbell!!
    }

private var _Doorbell: ImageVector? = null

