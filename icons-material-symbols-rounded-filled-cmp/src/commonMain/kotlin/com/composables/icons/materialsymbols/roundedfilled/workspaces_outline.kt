package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Workspaces_outline: ImageVector
    get() {
        if (_Workspaces_outline != null) return _Workspaces_outline!!
        
        _Workspaces_outline = ImageVector.Builder(
            name = "workspaces_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 21f)
                quadTo(4.35f, 21f, 3.175f, 19.825f)
                quadTo(2f, 18.65f, 2f, 17f)
                quadTo(2f, 15.35f, 3.175f, 14.175f)
                quadTo(4.35f, 13f, 6f, 13f)
                quadTo(7.65f, 13f, 8.825f, 14.175f)
                quadTo(10f, 15.35f, 10f, 17f)
                quadTo(10f, 18.65f, 8.825f, 19.825f)
                quadTo(7.65f, 21f, 6f, 21f)
                close()
                moveTo(12f, 11f)
                quadTo(10.35f, 11f, 9.175f, 9.825f)
                quadTo(8f, 8.65f, 8f, 7f)
                quadTo(8f, 5.35f, 9.175f, 4.175f)
                quadTo(10.35f, 3f, 12f, 3f)
                quadTo(13.65f, 3f, 14.825f, 4.175f)
                quadTo(16f, 5.35f, 16f, 7f)
                quadTo(16f, 8.65f, 14.825f, 9.825f)
                quadTo(13.65f, 11f, 12f, 11f)
                close()
                moveTo(18f, 21f)
                quadTo(16.35f, 21f, 15.175f, 19.825f)
                quadTo(14f, 18.65f, 14f, 17f)
                quadTo(14f, 15.35f, 15.175f, 14.175f)
                quadTo(16.35f, 13f, 18f, 13f)
                quadTo(19.65f, 13f, 20.825f, 14.175f)
                quadTo(22f, 15.35f, 22f, 17f)
                quadTo(22f, 18.65f, 20.825f, 19.825f)
                quadTo(19.65f, 21f, 18f, 21f)
                close()
            }
        }.build()
        
        return _Workspaces_outline!!
    }

private var _Workspaces_outline: ImageVector? = null

