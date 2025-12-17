package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SdCard: ImageVector
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
                moveTo(12.5f, 0f)
                horizontalLineTo(5.914f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.06f, 0.44f)
                lineTo(2.439f, 2.853f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.914f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 0f)
                moveToRelative(-7f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                moveToRelative(2f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                moveToRelative(2.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                moveToRelative(1.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
            }
        }.build()
        
        return _SdCard!!
    }

private var _SdCard: ImageVector? = null

