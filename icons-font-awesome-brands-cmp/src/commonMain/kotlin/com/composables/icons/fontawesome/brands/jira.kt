package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Jira: ImageVector
    get() {
        if (_Jira != null) return _Jira!!
        
        _Jira = ImageVector.Builder(
            name = "jira",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(490f, 241.7f)
                curveTo(417.1f, 169f, 320.6f, 71.8f, 248.5f, 0f)
                curveTo(83f, 164.9f, 6f, 241.7f, 6f, 241.7f)
                curveToRelative(-7.9f, 7.9f, -7.9f, 20.7f, 0f, 28.7f)
                curveTo(138.8f, 402.7f, 67.8f, 331.9f, 248.5f, 512f)
                curveToRelative(379.4f, -378f, 15.7f, -16.7f, 241.5f, -241.7f)
                curveToRelative(8f, -7.9f, 8f, -20.7f, 0f, -28.6f)
                close()
                moveToRelative(-241.5f, 90f)
                lineToRelative(-76f, -75.7f)
                lineToRelative(76f, -75.7f)
                lineToRelative(76f, 75.7f)
                lineToRelative(-76f, 75.7f)
                close()
            }
        }.build()
        
        return _Jira!!
    }

private var _Jira: ImageVector? = null

