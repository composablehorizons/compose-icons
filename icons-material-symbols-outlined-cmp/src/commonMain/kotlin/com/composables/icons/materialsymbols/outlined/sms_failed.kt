package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sms_failed: ImageVector
    get() {
        if (_Sms_failed != null) return _Sms_failed!!
        
        _Sms_failed = ImageVector.Builder(
            name = "sms_failed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 11f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(1f, 4f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 14.425f, 13f, 14f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(12.425f, 13f, 12f, 13f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 13.575f, 11f, 14f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(11.575f, 15f, 12f, 15f)
                close()
                moveTo(2f, 22f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(3.175f, 2f, 4f, 2f)
                horizontalLineToRelative(16f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(22f, 3.175f, 22f, 4f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 18f, 20f, 18f)
                horizontalLineTo(6f)
                close()
                moveToRelative(2f, -4.825f)
                lineTo(5.175f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 4f)
                verticalLineToRelative(13.175f)
                close()
            }
        }.build()
        
        return _Sms_failed!!
    }

private var _Sms_failed: ImageVector? = null

