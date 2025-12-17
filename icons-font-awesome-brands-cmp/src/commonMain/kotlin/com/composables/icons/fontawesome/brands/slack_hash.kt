package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.SlackHash: ImageVector
    get() {
        if (_SlackHash != null) return _SlackHash!!
        
        _SlackHash = ImageVector.Builder(
            name = "slack-hash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(446.2f, 270.4f)
                curveToRelative(-6.2f, -19f, -26.9f, -29.1f, -46f, -22.9f)
                lineToRelative(-45.4f, 15.1f)
                lineToRelative(-30.3f, -90f)
                lineToRelative(45.4f, -15.1f)
                curveToRelative(19.1f, -6.2f, 29.1f, -26.8f, 23f, -45.9f)
                curveToRelative(-6.2f, -19f, -26.9f, -29.1f, -46f, -22.9f)
                lineToRelative(-45.4f, 15.1f)
                lineToRelative(-15.7f, -47f)
                curveToRelative(-6.2f, -19f, -26.9f, -29.1f, -46f, -22.9f)
                curveToRelative(-19.1f, 6.2f, -29.1f, 26.8f, -23f, 45.9f)
                lineToRelative(15.7f, 47f)
                lineToRelative(-93.4f, 31.2f)
                lineToRelative(-15.7f, -47f)
                curveToRelative(-6.2f, -19f, -26.9f, -29.1f, -46f, -22.9f)
                curveToRelative(-19.1f, 6.2f, -29.1f, 26.8f, -23f, 45.9f)
                lineToRelative(15.7f, 47f)
                lineToRelative(-45.3f, 15f)
                curveToRelative(-19.1f, 6.2f, -29.1f, 26.8f, -23f, 45.9f)
                curveToRelative(5f, 14.5f, 19.1f, 24f, 33.6f, 24.6f)
                curveToRelative(6.8f, 1f, 12f, -1.6f, 57.7f, -16.8f)
                lineToRelative(30.3f, 90f)
                lineTo(78f, 354.8f)
                curveToRelative(-19f, 6.2f, -29.1f, 26.9f, -23f, 45.9f)
                curveToRelative(5f, 14.5f, 19.1f, 24f, 33.6f, 24.6f)
                curveToRelative(6.8f, 1f, 12f, -1.6f, 57.7f, -16.8f)
                lineToRelative(15.7f, 47f)
                curveToRelative(5.9f, 16.9f, 24.7f, 29f, 46f, 22.9f)
                curveToRelative(19.1f, -6.2f, 29.1f, -26.8f, 23f, -45.9f)
                lineToRelative(-15.7f, -47f)
                lineToRelative(93.6f, -31.3f)
                lineToRelative(15.7f, 47f)
                curveToRelative(5.9f, 16.9f, 24.7f, 29f, 46f, 22.9f)
                curveToRelative(19.1f, -6.2f, 29.1f, -26.8f, 23f, -45.9f)
                lineToRelative(-15.7f, -47f)
                lineToRelative(45.4f, -15.1f)
                curveToRelative(19f, -6f, 29.1f, -26.7f, 22.9f, -45.7f)
                close()
                moveToRelative(-254.1f, 47.2f)
                lineToRelative(-30.3f, -90.2f)
                lineToRelative(93.5f, -31.3f)
                lineToRelative(30.3f, 90.2f)
                lineToRelative(-93.5f, 31.3f)
                close()
            }
        }.build()
        
        return _SlackHash!!
    }

private var _SlackHash: ImageVector? = null

