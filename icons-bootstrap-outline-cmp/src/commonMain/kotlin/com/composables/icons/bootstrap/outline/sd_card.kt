package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SdCard: ImageVector
    get() {
        if (_SdCard != null) return _SdCard!!
        
        _SdCard = ImageVector.Builder(
            name = "sd-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
                moveToRelative(2f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
                moveToRelative(2f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
                moveToRelative(2f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.914f, 0f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 1.5f)
                verticalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 14.5f)
                verticalLineTo(3.914f)
                curveToRelative(0f, -0.398f, 0.158f, -0.78f, 0.44f, -1.06f)
                lineTo(4.853f, 0.439f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.914f, 0f)
                moveTo(13f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(5.914f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.353f, 0.146f)
                lineTo(3.146f, 3.561f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3f, 3.914f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _SdCard!!
    }

private var _SdCard: ImageVector? = null

