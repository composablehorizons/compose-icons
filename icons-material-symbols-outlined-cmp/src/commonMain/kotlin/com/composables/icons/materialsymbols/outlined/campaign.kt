package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Campaign: ImageVector
    get() {
        if (_Campaign != null) return _Campaign!!
        
        _Campaign = ImageVector.Builder(
            name = "campaign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
                moveToRelative(48f, 280f)
                lineToRelative(-128f, -96f)
                lineToRelative(48f, -64f)
                lineToRelative(128f, 96f)
                lineToRelative(-48f, 64f)
                close()
                moveToRelative(-80f, -480f)
                lineToRelative(-48f, -64f)
                lineToRelative(128f, -96f)
                lineToRelative(48f, 64f)
                lineToRelative(-128f, 96f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(160f)
                lineToRelative(200f, -120f)
                verticalLineToRelative(480f)
                lineTo(320f, 600f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -182f)
                verticalLineToRelative(-196f)
                lineToRelative(-98f, 58f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(182f)
                lineToRelative(98f, 58f)
                close()
                moveToRelative(120f, 36f)
                verticalLineToRelative(-268f)
                quadToRelative(27f, 24f, 43.5f, 58.5f)
                reflectiveQuadTo(620f, 480f)
                quadToRelative(0f, 41f, -16.5f, 75.5f)
                reflectiveQuadTo(560f, 614f)
                close()
                moveTo(300f, 480f)
                close()
            }
        }.build()
        
        return _Campaign!!
    }

private var _Campaign: ImageVector? = null

