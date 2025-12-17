package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Insights: ImageVector
    get() {
        if (_Insights != null) return _Insights!!
        
        _Insights = ImageVector.Builder(
            name = "insights",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 20f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(1f, 18.825f, 1f, 18f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(2.175f, 16f, 3f, 16f)
                horizontalLineToRelative(0.263f)
                quadToRelative(0.112f, 0f, 0.237f, 0.05f)
                lineToRelative(4.55f, -4.55f)
                quadTo(8f, 11.375f, 8f, 11.262f)
                verticalLineTo(11f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(9.175f, 9f, 10f, 9f)
                reflectiveQuadToRelative(1.413f, 0.587f)
                quadTo(12f, 10.175f, 12f, 11f)
                quadToRelative(0f, 0.05f, -0.05f, 0.5f)
                lineToRelative(2.55f, 2.55f)
                quadToRelative(0.125f, -0.05f, 0.238f, -0.05f)
                horizontalLineToRelative(0.524f)
                quadToRelative(0.113f, 0f, 0.238f, 0.05f)
                lineToRelative(3.55f, -3.55f)
                quadToRelative(-0.05f, -0.125f, -0.05f, -0.238f)
                verticalLineTo(10f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(20.175f, 8f, 21f, 8f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(23f, 9.175f, 23f, 10f)
                quadToRelative(0f, 0.825f, -0.587f, 1.412f)
                quadTo(21.825f, 12f, 21f, 12f)
                horizontalLineToRelative(-0.262f)
                quadToRelative(-0.113f, 0f, -0.238f, -0.05f)
                lineToRelative(-3.55f, 3.55f)
                quadToRelative(0.05f, 0.125f, 0.05f, 0.238f)
                verticalLineTo(16f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(15.825f, 18f, 15f, 18f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(13f, 16.825f, 13f, 16f)
                verticalLineToRelative(-0.262f)
                quadToRelative(0f, -0.113f, 0.05f, -0.238f)
                lineToRelative(-2.55f, -2.55f)
                quadToRelative(-0.125f, 0.05f, -0.238f, 0.05f)
                horizontalLineTo(10f)
                quadToRelative(-0.05f, 0f, -0.5f, -0.05f)
                lineTo(4.95f, 17.5f)
                quadToRelative(0.05f, 0.125f, 0.05f, 0.238f)
                verticalLineTo(18f)
                quadToRelative(0f, 0.825f, -0.588f, 1.413f)
                quadTo(3.825f, 20f, 3f, 20f)
                close()
                moveTo(4f, 9.975f)
                lineToRelative(-0.625f, -1.35f)
                lineTo(2.025f, 8f)
                lineToRelative(1.35f, -0.625f)
                lineTo(4f, 6.025f)
                lineToRelative(0.625f, 1.35f)
                lineTo(5.975f, 8f)
                lineToRelative(-1.35f, 0.625f)
                close()
                moveTo(15f, 9f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(12f, 6f)
                lineToRelative(2.05f, -0.95f)
                lineTo(15f, 3f)
                lineToRelative(0.95f, 2.05f)
                lineTo(18f, 6f)
                lineToRelative(-2.05f, 0.95f)
                close()
            }
        }.build()
        
        return _Insights!!
    }

private var _Insights: ImageVector? = null

