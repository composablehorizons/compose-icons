package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tools_wrench: ImageVector
    get() {
        if (_Tools_wrench != null) return _Tools_wrench!!
        
        _Tools_wrench = ImageVector.Builder(
            name = "tools_wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.275f, 19.8f)
                lineToRelative(0.7f, -0.7f)
                lineTo(12f, 11.125f)
                quadToRelative(0.475f, -0.575f, 0.738f, -1.3f)
                quadTo(13f, 9.1f, 13f, 8.3f)
                quadToRelative(0f, -1.875f, -1.312f, -3.175f)
                quadToRelative(-1.313f, -1.3f, -3.188f, -1.3f)
                horizontalLineToRelative(-0.25f)
                lineTo(11.325f, 6.9f)
                lineToRelative(-4.25f, 4.225f)
                lineTo(4f, 8.05f)
                verticalLineToRelative(0.275f)
                quadTo(4f, 10.2f, 5.312f, 11.5f)
                quadToRelative(1.313f, 1.3f, 3.188f, 1.3f)
                quadToRelative(0.8f, 0f, 1.513f, -0.263f)
                quadToRelative(0.712f, -0.262f, 1.287f, -0.737f)
                lineToRelative(7.975f, 8f)
                close()
                moveToRelative(-1.4f, 1.425f)
                lineToRelative(-6.9f, -6.9f)
                quadToRelative(-0.575f, 0.225f, -1.187f, 0.35f)
                quadToRelative(-0.613f, 0.125f, -1.263f, 0.125f)
                quadToRelative(-2.725f, 0f, -4.612f, -1.888f)
                quadTo(2.025f, 11.025f, 2.025f, 8.3f)
                quadToRelative(0f, -1.05f, 0.313f, -2.025f)
                quadToRelative(0.312f, -0.975f, 0.912f, -1.8f)
                lineTo(7.075f, 8.3f)
                lineTo(8.5f, 6.9f)
                lineTo(4.675f, 3.05f)
                quadToRelative(0.85f, -0.625f, 1.825f, -0.938f)
                quadToRelative(0.975f, -0.312f, 2f, -0.312f)
                quadToRelative(2.725f, 0f, 4.613f, 1.887f)
                quadTo(15f, 5.575f, 15f, 8.3f)
                quadToRelative(0f, 0.65f, -0.125f, 1.287f)
                quadToRelative(-0.125f, 0.638f, -0.375f, 1.213f)
                lineToRelative(6.875f, 6.875f)
                quadToRelative(0.575f, 0.575f, 0.588f, 1.412f)
                quadToRelative(0.012f, 0.838f, -0.563f, 1.413f)
                lineToRelative(-0.675f, 0.7f)
                quadToRelative(-0.575f, 0.6f, -1.413f, 0.612f)
                quadToRelative(-0.837f, 0.013f, -1.437f, -0.587f)
                close()
                moveTo(9.2f, 9f)
                close()
            }
        }.build()
        
        return _Tools_wrench!!
    }

private var _Tools_wrench: ImageVector? = null

