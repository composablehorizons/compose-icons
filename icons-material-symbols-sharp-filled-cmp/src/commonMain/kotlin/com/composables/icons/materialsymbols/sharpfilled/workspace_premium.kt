package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Workspace_premium: ImageVector
    get() {
        if (_Workspace_premium != null) return _Workspace_premium!!
        
        _Workspace_premium = ImageVector.Builder(
            name = "workspace_premium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(387f, 548f)
                lineToRelative(35f, -114f)
                lineToRelative(-92f, -74f)
                horizontalLineToRelative(114f)
                lineToRelative(36f, -112f)
                lineToRelative(36f, 112f)
                horizontalLineToRelative(114f)
                lineToRelative(-93f, 74f)
                lineToRelative(35f, 114f)
                lineToRelative(-92f, -71f)
                lineToRelative(-93f, 71f)
                close()
                moveTo(240f, 920f)
                verticalLineToRelative(-309f)
                quadToRelative(-38f, -42f, -59f, -96f)
                reflectiveQuadToRelative(-21f, -115f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 61f, -21f, 115f)
                reflectiveQuadToRelative(-59f, 96f)
                verticalLineToRelative(309f)
                lineToRelative(-240f, -80f)
                lineToRelative(-240f, 80f)
                close()
                moveToRelative(240f, -280f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Workspace_premium!!
    }

private var _Workspace_premium: ImageVector? = null

